package desafio.dominio;

import java.time.LocalDate;

public class Main {

    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String CYAN = "\u001B[36m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java Completo");
        cursoJava.setDescricao("Descrição completa do curso de Java");
        cursoJava.setHoras(10);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso de JavaScript");
        cursoJS.setDescricao("Descrição do curso de JS");
        cursoJS.setHoras(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria para o Ecossistema Java");
        mentoriaJava.setDescricao("Descrição da mentoria com especialista em Java");
        mentoriaJava.setDataMentoria(LocalDate.now().plusDays(10));

        Bootcamp bootcampDev = new Bootcamp();
        bootcampDev.setNome("Bootcamp Java Avançado");
        bootcampDev.setDescricao("O bootcamp para se tornar um desenvolvedor Java especialista");
        bootcampDev.getConteudos().add(cursoJava);
        bootcampDev.getConteudos().add(cursoJS);
        bootcampDev.getConteudos().add(mentoriaJava);

        // --- Simulando o Dev Lucas ---
        System.out.println(GREEN + BOLD + "\n==============================================" + RESET);
        System.out.println(GREEN + BOLD + "            SIMULANDO DEV LUCAS" + RESET);
        System.out.println(GREEN + BOLD + "==============================================" + RESET);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcampDev);
        System.out.println(CYAN + "• Conteúdos inscritos de Lucas: " + devLucas.getInscricoes() + RESET);
        System.out.println(CYAN + "• XP atual de Lucas: " + devLucas.calcularTotalXp() + RESET);

        System.out.println(YELLOW + "\nLucas vai progredir..." + RESET);
        devLucas.progredir();
        devLucas.progredir();

        System.out.println(CYAN + "----------------------------------------------" + RESET);
        System.out.println(CYAN + "• Conteúdos inscritos após progredir: " + devLucas.getInscricoes() + RESET);
        System.out.println(CYAN + "• Conteúdos concluídos: " + devLucas.getConclusoes() + RESET);
        System.out.println(GREEN + BOLD + "• XP total de Lucas: " + devLucas.calcularTotalXp() + RESET);
        System.out.println(GREEN + BOLD + "==============================================" + RESET);

        // --- Simulando o Dev Marina ---
        System.out.println(GREEN + BOLD + "\n==============================================" + RESET);
        System.out.println(GREEN + BOLD + "            SIMULANDO DEV MARINA" + RESET);
        System.out.println(GREEN + BOLD + "==============================================" + RESET);

        Dev devMarina = new Dev();
        devMarina.setNome("Marina");
        devMarina.inscreverBootcamp(bootcampDev);
        System.out.println(CYAN + "• Conteúdos inscritos de Marina: " + devMarina.getInscricoes() + RESET);
        System.out.println(CYAN + "• XP atual de Marina: " + devMarina.calcularTotalXp() + RESET);

        System.out.println(YELLOW + "\nMarina vai progredir..." + RESET);
        devMarina.progredir();
        devMarina.progredir();
        devMarina.progredir();

        System.out.println(CYAN + "----------------------------------------------" + RESET);
        System.out.println(CYAN + "• Conteúdos inscritos após progredir: " + devMarina.getInscricoes() + RESET);
        System.out.println(CYAN + "• Conteúdos concluídos: " + devMarina.getConclusoes() + RESET);
        System.out.println(GREEN + BOLD + "• XP total de Marina: " + devMarina.calcularTotalXp() + RESET);
        System.out.println(GREEN + BOLD + "==============================================" + RESET);
    }
}
