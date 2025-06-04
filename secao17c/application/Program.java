package secao17c.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import secao17b.services.CalculationService;
import secao17c.entities.Product;

public class Program {

	public static void main(String[] args) {

		// number list integer
		List<Product> list = new ArrayList<>();

		// Here I am defining a path of a file
		String path = "C:\\temp\\in2.txt";

		// Note I - baseboard
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				// How Integer.parseInt(line) works - Note II
				// Como funciona Integer.parseInt(line) - Note II
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

/*
 * Note I. What is BufferedReader? BufferedReader is a top-level class in the
 * java.io.Reader hierarchy that adds a buffer (a temporary memory area) to any
 * other Reader you provide. It is designed to increase the efficiency of text
 * reading operations by reducing the number of physical accesses (syscalls) to
 * the file or input device.
 * 
 * How Buffering Works
 * 
 * When you call readLine() (or read()), BufferedReader internally reads several
 * characters at once (the default size is 8,192 characters) and places them in
 * memory.
 * 
 * Subsequent calls consume this buffer in RAM; only when the buffer is empty
 * does the object read from the file again.
 * 
 * This is much faster than reading character by character directly from disk.
 * 
 * Main advantages
 * 
 * Performance: fewer expensive I/O operations.
 * 
 * Convenience API: readLine() method already returns each entire line as a
 * String, eliminating the need for you to iterate character by character until
 * you find '\n'.
 * 
 * 
 * Note I. O que é BufferedReader? BufferedReader é uma classe de alto nível da
 * hierarquia java.io.Reader que acrescenta um buffer (uma área de memória
 * temporária) a qualquer outro Reader que você fornecer. Ele foi projetado para
 * aumentar a eficiência das operações de leitura de texto, reduzindo o número
 * de acessos físicos (syscalls) ao arquivo ou dispositivo de entrada.
 * 
 * Como funciona o buffer
 * 
 * Quando você chama readLine() (ou read()), o BufferedReader lê internamente
 * vários caracteres de uma só vez (o tamanho-padrão é 8 192 caracteres) e
 * coloca‐os em memória.
 * 
 * As chamadas subsequentes consomem esse buffer na RAM; só quando o buffer
 * esvazia é que o objeto faz outra leitura no arquivo.
 * 
 * Isso é muito mais rápido do que ler caractere por caractere diretamente do
 * disco.
 * 
 * Principais vantagens
 * 
 * Performance: menos operações de I/O custosas.
 * 
 * API de conveniência: método readLine() já devolve cada linha inteira como
 * String, eliminando a necessidade de você mesmo iterar caractere por caractere
 * até encontrar '\n'.
 */

