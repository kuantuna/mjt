import static org.junit.Assert.assertEquals;

class IndicatorTest {
    @org.junit.Test
    public void testIndicator() {
        Indicator indicator = new Indicator();
        int a = 5;
        String result = indicator.indicator(a);
        assertEquals(result, "acidic");
    }

}