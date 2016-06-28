import android.os.Build.VERSION;

public final class hwg
{
  public static final String a;
  public static final String b;
  private static final String c = mga.a("debug.editor.use.editor", "");
  
  static
  {
    String str1;
    if ("".equals(c))
    {
      str1 = "com.google.android.apps.photoeditor.fragments.PlusCropActivity";
      a = str1;
      if (!"".equals(c)) {
        break label54;
      }
    }
    label54:
    for (String str2 = "com.google.android.apps.photoeditor.fragments.PhotoEditorActivity";; str2 = c)
    {
      b = str2;
      return;
      str1 = c;
      break;
    }
  }
  
  public static boolean a()
  {
    return Build.VERSION.SDK_INT >= 14;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwg
 * JD-Core Version:    0.7.0.1
 */