package lesson10.abstractbigexample;

/**
 * Created by Alex on 21.08.2017.
 */
public abstract class Employee {
    private String name;
    private int age;
    private int yearsOfExpirience;

    private String curPosition;

    private int saleryPerMonth;
    private BankAccount bankAccount;
    private Company[] companiesWorked = new Company[10];
    private String[] positionsWorked = new String[10];



    abstract void paySalery();

    void changePosition(String newPosition){
        //сохранить текущую позицию в историю
        //поменять позицию
        saveCurPositionToHistory();
        curPosition = newPosition;
    }

    private void saveCurPositionToHistory(){
        int index = 0;
        for (String pos : positionsWorked){
            if(pos == null){
                positionsWorked[index] = curPosition;
                break;
            }
            index++;
        }
    }

   int getBalance(){

        return bankAccount.getBalance();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSaleryPerMonth() {
        return saleryPerMonth;
    }

    public String getName() {
        return name;
    }

    public String[] getPositionsWorked() {
        return positionsWorked;
    }

    public String getCurPosition() {
        return curPosition;
    }

    public void setCurPosition(String curPosition) {
        this.curPosition = curPosition;
    }

    public void setSaleryPerMonth(int saleryPerMonth) {
        this.saleryPerMonth = saleryPerMonth;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
