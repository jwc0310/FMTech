import android.content.Context;

final class gka
  implements gji
{
  gka(gjt paramgjt) {}
  
  public final String a()
  {
    return "add_skinny_page_boolean";
  }
  
  public final void a(Context paramContext, gje paramgje)
  {
    boolean bool1 = paramgje.c("is_google_plus");
    boolean bool2 = false;
    if (!bool1)
    {
      int i = paramgje.a("page_count", 0);
      bool2 = false;
      if (i > 0) {
        bool2 = true;
      }
    }
    paramgje.c("gplus_skinny_page", bool2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gka
 * JD-Core Version:    0.7.0.1
 */