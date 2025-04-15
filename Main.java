public class Main {
    public static void main(String[] args) {
        // Laki-laki telah menikah
        Manusia lakinikah = new Manusia("Gunawan", "123456789", true, true);
        System.out.println(lakinikah);
        System.out.println();

        // Perempuan telah menikah
        Manusia perempuanmenikah = new Manusia("Dewi", "987654321", false, true);
        System.out.println(perempuanmenikah);
        System.out.println();

        // Laki-laki belum menikah
        Manusia lakibelumnikah = new Manusia("Andre", "123456789", true, false);
        System.out.println(lakibelumnikah);
        System.out.println();

        // MAHASISWA FILKOM
        // IPK < 3
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("123456789", 2.5, "Andi", "123456789", true, false);
        System.out.println(mahasiswa1);

        // IPK 3 - 3.5
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("987654321", 3.2, "Siti", "987654321", false, true);
        System.out.println(mahasiswa2);
        System.out.println();

        // IPK 3.5 - 4
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("123456789", 3.8, "Rina", "123456789", true, true);
        System.out.println(mahasiswa3);
        System.out.println();

        // PEKERJA
        // Lama bekerja 2 tahun, anak 2
        Pekerja pekerja1 = new Pekerja(5000, 2023, 1, 1, 2, "Joko", "123456789", true, false);
        System.out.println(pekerja1);
        System.out.println();

        // Lama bekerja 9 tahun
        Pekerja pekerja2 = new Pekerja(7000, 2016, 1, 1, 1, "Siti", "987654321", false, true);
        System.out.println(pekerja2);
        System.out.println();

        // Lama bekerja 20 tahun, anak 10
        Pekerja pekerja3 = new Pekerja(10000, 2005, 1, 1, 10, "Rina", "123456789", true, true);
        System.out.println(pekerja3);
        System.out.println();

        // MANAGER, lama bekerja 15 tahun dengan gaji $7500
        Manager manager1 = new Manager("IT", 7500, 2010, 1, 1, 3, "Budi", "123456789", true, false);
        System.out.println(manager1);
    }
}
