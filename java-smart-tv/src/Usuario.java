public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv myTv = new SmartTv();

        System.out.println(myTv.ligada);
        System.out.println(myTv.canal);
        System.out.println(myTv.volume);

        myTv.ligar();
        System.out.println(myTv.ligada);
        myTv.aumentarCanal();
        myTv.aumentarCanal();
        myTv.aumentarCanal();
        myTv.diminuirCanal();
        System.out.println(myTv.canal);
        myTv.abaixarVolume();
        myTv.abaixarVolume();
        myTv.abaixarVolume();
        myTv.aumentarVolume();
        System.out.println(myTv.volume);
        

    }
}
