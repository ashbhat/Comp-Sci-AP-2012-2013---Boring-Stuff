class TaxReturn {   
  private static final double RATE1 = 0.15; 
  private static final double RATE2 = 0.28; 
  private static final double RATE3 = 0.31; 
  
  private static final double SINGLE_BRACKET1 = 21450; 
  private static final double SINGLE_BRACKET2 = 51900; 

  private static final double MARRIED_BRACKET1 = 35800; 
  private static final double MARRIED_BRACKET2 = 86500;  
  
  public static final int SINGLE = 1; 
  public static final int MARRIED = 2; 
  
  private int status;
  private double income; 
        
  /** 
   * Constructs a TaxReturn object for given income and marital status. 
   *   @param anIncome the taxpayer income 
   *   @param aStatus either TaxReturn.SINGLE or TaxReturn.MARRIED 
   */    
  public TaxReturn(double anIncome, int aStatus) {   
    this.income = anIncome; 
    this.status = aStatus; 
  } 

  /**
   * Calculates the tax owed by the filer.
   *   @return the amount (in dollars) owed
   */
  public double getTax() {   
    double tax = 0; 
    double bracket1 = TaxReturn.SINGLE_BRACKET1;
    double bracket2 = TaxReturn.SINGLE_BRACKET2;
    if (this.status == TaxReturn.MARRIED) {  
        bracket1 = TaxReturn.MARRIED_BRACKET1;
        bracket2 = TaxReturn.MARRIED_BRACKET2;
    }
        
    if (this.income <= bracket1) {
      tax = TaxReturn.RATE1 * this.income; 
    }
    else if (this.income <= bracket2) {
      tax = TaxReturn.RATE1 * bracket1 +
            TaxReturn.RATE2 * (this.income - bracket1); 
    } 
    else { 
      tax = TaxReturn.RATE1 * bracket1 +
            TaxReturn.RATE2 * (bracket2 - bracket1) +                    
            TaxReturn.RATE3 * (this.income - bracket2); 
    }
    
    return tax; 
  } 
} 
