public class Main{
    public static void main (String [] args)
    {
        Developer dev = new Developer();
        Engineer eng = new Engineer();
        SystemAnalyst sa = new SystemAnalyst();

        System.out.println("===== Developer =====");
        dev.jobdesk();
        dev.gaji();
        dev.jamKerja();
        dev.catatan();
        System.out.println("===== Engineer =====");
        eng.jobdesk();
        eng.gaji();
        eng.jamKerja();
        System.out.println("===== System Analyst =====");
        sa.jobdesk();
        sa.gaji();
        sa.jamKerja();
        
        System.out.println("===== Informasi Tambahan =====");
        dev.penempatanKerja();
    }
}