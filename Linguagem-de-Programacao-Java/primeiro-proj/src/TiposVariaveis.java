public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        final String MEU_NOME = "Marcos Germinio";  //final siginifica que este valor contante e não pode ser mudado
        final short DATA_NASCIMENTO = 1996;   // limite de 5 digitos indo até 30000
        long telefone = 21980813358L; // limite são 19 digitos e precisa da letra L no final
        int cep = 207561210;    // Padrão utilizado porém o limite são 10 digitos
        float altura = 1.74F; // limite alto mas precisa por letra F no final
        byte idade = 27;    // limite de 3 digitos indo até 127
        double salario = 1235.33; // o dobro da capacidade do float apenas
        System.out.println("Nome: " + MEU_NOME);
        System.out.println("Data de nascimento: " + DATA_NASCIMENTO);
        System.out.println("Telefone: " + telefone);
        System.out.println("CEP: " + cep);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
    }
}
