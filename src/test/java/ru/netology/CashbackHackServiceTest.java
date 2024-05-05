package ru.netology;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldAddAmountIfLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldAddAmountIfMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldNotAddAmountIf1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
}
