public class mahasiswa {
  private String nama;
  private String fakultas;
  private String hobbi;
  private String nim;

  public mahasiswa (String nama, String nim, String fakultas, String hobbi)
  {
    this.nama = nama;
    this.nim = nim;
    this.fakultas = fakultas;
    this.hobbi = hobbi;
  }
  public String nama(){
    return nama;
  }
  public String getnim(){
    return nim;
  }
  public String fakultas(){
    return fakultas;
  }
  public String hobbi(){
    return hobbi;
  }
  public String Pesan(){
    return("Hello!. Nama saya "+ this.nama()+ " ("+ this.getnim()+ (")")+
    ". Saya dari Fakultas "+ this.fakultas()+
     " Hobbi saya adalah "+ this.hobbi());
  }

  public static void main(String[] args){
    mahasiswa theo = new mahasiswa("Theo", "064002100037", "Teknik Informatika.", "Mendaki Gunung.");
    System.out.println(theo.Pesan());
  }
}
