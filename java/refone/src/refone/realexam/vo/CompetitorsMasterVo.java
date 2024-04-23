package refone.realexam.vo;

import java.util.Objects;

public class CompetitorsMasterVo { //CompetitorsMaster라는 테이블의 데이터를 정의하는 클래스
   private String competCode;
   private String competName;
   private String address;
   private long yearSales;
   private int numOfEmployees;
   private String phone1;
   private String phone2;
   public CompetitorsMasterVo() {
      super();
      // TODO Auto-generated constructor stub
   }
   public CompetitorsMasterVo(String competCode, String competName, String address, long yearSales, int numOfEmployees,
         String phone1, String phone2) {
      super();
      this.competCode = competCode;
      this.competName = competName;
      this.address = address;
      this.yearSales = yearSales;
      this.numOfEmployees = numOfEmployees;
      this.phone1 = phone1;
      this.phone2 = phone2;
   }
   public String getCompetCode() {
      return competCode;
   }
   public void setCompetCode(String competCode) {
      this.competCode = competCode;
   }
   public String getCompetName() {
      return competName;
   }
   public void setCompetName(String competName) {
      this.competName = competName;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public long getYearSales() {
      return yearSales;
   }
   public void setYearSales(long yearSales) {
      this.yearSales = yearSales;
   }
   public int getNumOfEmployees() {
      return numOfEmployees;
   }
   public void setNumOfEmployees(int numOfEmployees) {
      this.numOfEmployees = numOfEmployees;
   }
   public String getPhone1() {
      return phone1;
   }
   public void setPhone1(String phone1) {
      this.phone1 = phone1;
   }
   public String getPhone2() {
      return phone2;
   }
   public void setPhone2(String phone2) {
      this.phone2 = phone2;
   }
   @Override
   public int hashCode() {
      return Objects.hash(address, competCode, competName, numOfEmployees, phone1, phone2, yearSales);
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      CompetitorsMasterVo other = (CompetitorsMasterVo) obj;
      return Objects.equals(address, other.address) && Objects.equals(competCode, other.competCode)
            && Objects.equals(competName, other.competName) && numOfEmployees == other.numOfEmployees
            && Objects.equals(phone1, other.phone1) && Objects.equals(phone2, other.phone2)
            && yearSales == other.yearSales;
   }
   @Override
   public String toString() {
      return "CompetitorsMasterVo [competCode=" + competCode + ", competName=" + competName + ", address=" + address
            + ", yearSales=" + yearSales + ", numOfEmployees=" + numOfEmployees + ", phone1=" + phone1 + ", phone2="
            + phone2 + "]";
   }
   
   
}