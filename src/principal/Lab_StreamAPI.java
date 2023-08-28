package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lab_StreamAPI {

    public static void main(String[] args) {

//        List<String> minhasLetras = Arrays.asList("A", "X", "Y", "T");
//        List<String> minhasVogais = minhasLetras.stream()
//                .filter(letra -> letra.equals("A"))
//                .limit(1)
//                .collect(Collectors.toList());
///////////////////////////////////////////////////////////////////////////////////////
//        List<Integer> meusNumeros = Arrays.asList(10, 9, 8, 7, 1, 2, 3, 4, 5, 6);
//        meusNumeros.stream()
//                .filter(numero -> numero % 2 == 0)
//                .forEach(System.out::println);
///////////////////////////////////////////////////////////////////////////////////////
//        List<String> nomes = Arrays.asList("Joao", "Paulo", "Rafaela", "Renato");
//        List<String> filteredNomes = nomes.stream()
//                .filter(nome -> nome.startsWith("R"))
//                .collect(Collectors.toList());
///////////////////////////////////////////////////////////////////////////////////////
//        List<Integer> meusNumeros = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
//        meusNumeros.stream()
//                .map(e -> e * 2)
//                .forEach(e -> System.out.print(e + " "));
//        System.out.println(meusNumeros); // coleção original inalterada
///////////////////////////////////////////////////////////////////////////////////////
//        List<Integer> meusNumeros = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
//        Optional<Integer> maiorNumero = meusNumeros.stream()
//                .map(e -> e * 2)
//                .max(Comparator.naturalOrder());
//        System.out.println(maiorNumero.get());
///////////////////////////////////////////////////////////////////////////////////////
//        List<Integer> meusNumeros = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
//        List<Integer> meusNumerosParesEmDobro = meusNumeros.stream()
//                .filter(e -> e % 2 == 0)
//                .map(e -> e * 2)
//                .collect(Collectors.toList()); // criando uma nova coleção
//        System.out.println(meusNumerosParesEmDobro);
///////////////////////////////////////////////////////////////////////////////////////
//        List<Integer> meusNumeros = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
//        Map<Boolean, List<Integer>> mapaDosNumeros = meusNumeros.stream() // cria um mapa com chave/valor
//                .map(e -> e * 2)
//                .collect(Collectors.groupingBy(e -> e > 8));
//        System.out.println(mapaDosNumeros);
///////////////////////////////////////////////////////////////////////////////////////
//        List<Integer> meusNumeros = Arrays.asList(1, 5, 8, 7, 4, 2, 3, 2, 1, 8, 5, 7, 4);
//        String stringUnicaDosNumeros = meusNumeros.stream()
//                .map(String::valueOf) // transforma cada item em String
//                .collect(Collectors.joining(";")); // junta todas as Strings em uma única separada por ';'
//        System.out.println(stringUnicaDosNumeros);
    }

}
