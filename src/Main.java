public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        Author markTven = new Author("Марк", "Твен");
        Book warAndPeace = new Book("Война и Мир", levTolstoi, 1869);
        Book princeAndPauper = new Book("Принц и Нищий", markTven, 1881);
        System.out.println("levTolstoi.getName() = " + levTolstoi.getName());
        System.out.println("levTolstoi.getSurname() = " + levTolstoi.getSurname());
        System.out.println("markTven.getName() = " + markTven.getName());
        System.out.println("markTven.getSurname() = " + markTven.getSurname());
        System.out.println("warAndPeace.getTitle() = " + warAndPeace.getTitle());
        System.out.println("warAndPeace.getAuthor().getName() = " + warAndPeace.getAuthor().getName());
        System.out.println("warAndPeace.getAuthor().getSurname() = " + warAndPeace.getAuthor().getSurname());
        System.out.println("warAndPeace.getYearOfPublication() = " + warAndPeace.getYearOfPublication());
        System.out.println("princeAndPauper.getTitle() = " + princeAndPauper.getTitle());
        System.out.println("princeAndPauper.getAuthor().getName() = " + princeAndPauper.getAuthor().getName());
        System.out.println("princeAndPauper.getAuthor().getSurname() = " + princeAndPauper.getAuthor().getSurname());
        System.out.println("princeAndPauper.getYearOfPublication() = " + princeAndPauper.getYearOfPublication());
        princeAndPauper.setYearOfPublication(1900);
        System.out.println("princeAndPauper.getYearOfPublication() = " + princeAndPauper.getYearOfPublication());

        System.out.println("levTolstoi.toString() = " + levTolstoi.toString());
        System.out.println("warAndPeace.toString() = " + warAndPeace.toString());
        System.out.println("markTven.toString() = " + markTven.toString());
        System.out.println("princeAndPauper.toString() = " + princeAndPauper.toString());
    }
}