package designPatterns.composite;

public class Main {

    public static void main(String[] args) {
        Folder ensaFolder = new Folder("ENSA");

        Folder API1Folder = new Folder("API1");
        Folder API2Folder = new Folder("API2");

        File analyse1 = new File("Analyse1");
        File analyse2 = new File("Analyse2");
        File analyse3 = new File("Analyse3");
        File analyse4 = new File("Analyse4");

        Folder preparation = new Folder("PREPARATION");

        Folder exams = new Folder("EXAMS");
        File exam1 = new File("EXAM_1");
        File exam2 = new File("EXAM_2");
        File exam3 = new File("EXAM_3");

        ensaFolder.add(API1Folder);
        ensaFolder.add(API2Folder);

        API1Folder.add(analyse1);
        API1Folder.add(analyse2);

        API2Folder.add(analyse3);
        API2Folder.add(analyse4);

        exams.add(exam1);
        exams.add(exam2);
        exams.add(exam3);

        preparation.add(exams);

        API1Folder.add(preparation);

        ensaFolder.print();
    }
}
