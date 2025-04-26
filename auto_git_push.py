#!/usr/bin/env python3
"""
auto_git_push.py  � Roda commits e push autom�ticos a cada 30 min.

Requisitos:
   Python = 3.8
   Git instalado e no PATH
   Permiss�es de grava��o no reposit�rio
"""

import subprocess
import time
from datetime import datetime
from pathlib import Path

# Caminho local do seu reposit�rio � ajuste conforme necess�rio
REPO_DIR = Path(r"C:\Projetos\java\professorNellio\src")   # exemplo em Windows
# REPO_DIR = Path("/home/usuario/meu-repo") # exemplo em Linux/macOS

def git(*args):
    """Executa um comando Git dentro de REPO_DIR."""
    cmd = ["git", "-C", str(REPO_DIR), *args]
    subprocess.run(cmd, check=True)

def ciclo():
    """Executa um ciclo completo de status, add, commit e push."""
    # 1) status - s� para log
    git("status")
    # 2) adiciona tudo que mudou (novos, editados, removidos)
    git("add", "-A")
    # 3) commit com data/hora atual
    timestamp = datetime.now().strftime("%Y-%m-%d %H:%M")
    git("commit", "-m", f"Atualiza��o {timestamp}")
    # 4) push para o remoto configurado (ex.: origin main)
    git("push")

if __name__ == "__main__":
    print("? Git auto-push iniciado - intervalo de 30 min.")
    while True:
        try:
            ciclo()
            print("? Ciclo conclu�do; aguardando 30 min.")
        except subprocess.CalledProcessError as err:
            # se algo deu errado, mostra no terminal mas continua tentando no pr�ximo ciclo
            print(f"?? Erro: {err}. Tentarei novamente em 30 min.")
        time.sleep(30 * 60)  # 30*60 seg = 30 min
