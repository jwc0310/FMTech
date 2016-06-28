import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;

public final class czf
{
  final Context a;
  ProgressDialog b;
  final Handler c = new czg(this);
  
  private czf(Context paramContext, int paramInt)
  {
    this.a = paramContext;
    switch (czh.a[(paramInt - 1)])
    {
    default: 
      return;
    case 1: 
      this.b = ProgressDialog.show(this.a, "Dump database", "Dumping ...", false, false, null);
      new czk(this).execute(new Void[] { null });
      return;
    }
    this.b = ProgressDialog.show(this.a, "Clean database", "Cleaning ...", false, false, null);
    new czi(this).execute(new Void[] { null });
  }
  
  public static void a(Context paramContext, CharSequence paramCharSequence)
  {
    if ("*#*#dumpdb*#*#".equals(paramCharSequence.toString())) {
      new czf(paramContext, czj.a);
    }
    while (!"*#*#cleandb*#*#".equals(paramCharSequence.toString())) {
      return;
    }
    new czf(paramContext, czj.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czf
 * JD-Core Version:    0.7.0.1
 */