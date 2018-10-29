/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan51.gajikaryawan;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk mehitung Gaji total karyawan, sesuai dengan
 *            Golongan, Jabatan, dan Kehadiranya.
 */
public class PBO310117113Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        Scanner scn5 = new Scanner(System.in);
     
        Manager karyawan = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK\t: ");
        karyawan.setNik(scn1.next());
        System.out.print("Masukkan Nama\t: ");
        karyawan.setNama(scn2.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        karyawan.setGolongan(scn3.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        karyawan.setJabatan(scn4.next());
        System.out.print("Masukkan Jumlah Kehadiran \t: ");
        karyawan.setKehadiran(scn5.nextInt());
                
        System.out.println(" ");
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("NIK\t: "+karyawan.getNik());
        System.out.println("NAMA\t: "+karyawan.getNama());
        System.out.println("GOLONGAN: "+karyawan.getGolongan());
        System.out.println("JABATAN\t: "+karyawan.getJabatan());
        
        System.out.println(" ");
        System.out.println("TUNJANGAN GOLONGAN\t: "+karyawan.tunjanganGolongan
        (karyawan.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: "+karyawan.tunjanganJabatan
        (karyawan.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: "+karyawan.tunjanganKehadiran
        (karyawan.getKehadiran()));
        
        System.out.println(" ");
        System.out.println("Gaji Total\t: "+karyawan.gajiTotal());        
                
    }
    
}
