public class Main {
    public static void main(String[] args) {
        Division gs = new Division("Graduate School");
        Division cephd = new Division("Computer Engineering PhD Program");
        People std1 = new People("Erdem Okur");
        People std2 = new People("Hande Aka Uymaz");
        People std3 = new People("Çağkan Uludağlı");

        cephd.add(std1);
        cephd.add(std2);
        cephd.add(std3);

        gs.add(cephd);

        //System.out.println(gs.getSize());

        People deanGs = new People("Dean of Graduate School");
        People SecretaryGs = new People("Institute Secretary");

        gs.add(deanGs);
        gs.add(SecretaryGs);

        //System.out.println(gs.getSize());

        Division Eng = new Division("Faculty of Engineering");
        Division Ceng = new Division("Department of Computer Engineering");
        People prof1 = new People("Kaya Oguz");
        People prof2 = new People("Ilker Korkmaz");

        Ceng.add(prof1);
        Ceng.add(prof2);
        Eng.add(Ceng);

        //System.out.println(Ceng.getSize());

        People DeanEng = new People("Dean");
        People SecretaryEng = new People("Faculty of Engineering Secretary");
        Eng.add(DeanEng);
        Eng.add(SecretaryEng);

        //System.out.println(Eng.getSize());

        // now onto IUE design

        Division IUE = new Division("Izmir University Of Economics");
        People CEstd1 = new People("Negar ChamaniTabriz");
        People CEstd2 =  new People("Sidelya Caliskan");
        People CEstd3 = new People("Gozde Kahraman");
        People CEstd4 = new People("Ozge Ozer");

        Eng.add(CEstd1); Eng.add(CEstd2); Eng.add(CEstd3); Eng.add(CEstd4);
        Ceng.add(CEstd1); Ceng.add(CEstd2); Ceng.add(CEstd3); Ceng.add(CEstd4);

        //System.out.println(Ceng.getSize());


        IUE.add(gs);
        IUE.add(Eng);


        int numPeople = IUE.getSize();
        System.out.println("Total Number Of People in the University : " +numPeople);



    }
}