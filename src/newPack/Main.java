package newPack;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            System.out.println(Files.readTxtFile("C:\\Users\\Hoochymoochy\\Desktop\\Workplace\\Neumont\\Q4\\Database II\\Week one\\Assignment 1 - data-1\\people\\simple\\"+i+".txt"));
        }

        System.out.println("\n");

        for(int i = 1; i < 11; i++){
            String context = Files.readTxtFile("C:\\Users\\Hoochymoochy\\Desktop\\Workplace\\Neumont\\Q4\\Database II\\Week one\\Assignment 1 - data-1\\people\\simple\\"+i+".txt");
            String[] split = context.split(",");
            Data struct = new Data(split[0],split[1],split[2],split[3]);
            System.out.println(struct.toString());
        }
    }
}
