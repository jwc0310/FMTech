public final class gmm
{
  public static final String a = hrc.class.getName();
  private static gml b;
  
  public static void a(mbb parammbb)
  {
    if (b == null) {
      b = new gml();
    }
    hrc[] arrayOfhrc = new hrc[4];
    arrayOfhrc[0] = new gmn("Accounts");
    arrayOfhrc[1] = new gmp("AddAccountAction");
    arrayOfhrc[2] = new gmr("RemoveAccountAction");
    arrayOfhrc[3] = new gmq("ManageAccountsAction");
    parammbb.a(hrc.class, arrayOfhrc);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gmm
 * JD-Core Version:    0.7.0.1
 */