import android.content.Context;
import android.text.TextUtils;

public final class lfn
{
  final kcy a;
  final boolean b;
  
  public lfn(Context paramContext, kcg paramkcg, String paramString1, int paramInt, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {}
    for (boolean bool = true;; bool = false)
    {
      this.b = bool;
      if (!this.b) {
        break;
      }
      qyd localqyd = new qyd();
      localqyd.b = paramString1;
      localqyd.c = new String[] { paramString2 };
      localqyd.d = paramInt;
      this.a = new kcy(paramContext, paramkcg, qyd.a, localqyd);
      return;
    }
    qyj localqyj = new qyj();
    localqyj.b = paramString1;
    localqyj.c = paramInt;
    this.a = new kcy(paramContext, paramkcg, qyj.a, localqyj);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfn
 * JD-Core Version:    0.7.0.1
 */