import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;

public class kfv
  extends ket
  implements kfm
{
  public int a;
  private boolean b;
  private boolean c;
  private int d;
  
  public kfv(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private kfv(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, efj.Uo);
  }
  
  private kfv(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, kfu.I, paramInt, 0);
    this.a = localTypedArray.getInt(kfu.J, 1);
    this.b = localTypedArray.getBoolean(kfu.K, true);
    this.c = localTypedArray.getBoolean(kfu.L, true);
    localTypedArray.recycle();
  }
  
  private void a(Uri paramUri)
  {
    if (paramUri != null) {}
    for (String str = paramUri.toString();; str = "")
    {
      e(str);
      return;
    }
  }
  
  protected final Object a(TypedArray paramTypedArray, int paramInt)
  {
    return paramTypedArray.getString(paramInt);
  }
  
  protected final void a(kfk paramkfk)
  {
    super.a(paramkfk);
    try
    {
      if (paramkfk.d == null) {
        paramkfk.d = new ArrayList();
      }
      if (!paramkfk.d.contains(this)) {
        paramkfk.d.add(this);
      }
      this.d = paramkfk.c();
      return;
    }
    finally {}
  }
  
  protected final void a(boolean paramBoolean, Object paramObject)
  {
    String str = (String)paramObject;
    if (paramBoolean) {}
    while (TextUtils.isEmpty(str)) {
      return;
    }
    a(Uri.parse(str));
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    if (paramInt == this.d)
    {
      Uri localUri;
      if (paramIntent != null)
      {
        localUri = (Uri)paramIntent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        if (localUri == null) {
          break label48;
        }
      }
      label48:
      for (String str = localUri.toString();; str = "")
      {
        if (b(str)) {
          a(localUri);
        }
        return true;
      }
    }
    return false;
  }
  
  protected final void b()
  {
    Intent localIntent = new Intent("android.intent.action.RINGTONE_PICKER");
    String str = a(null);
    boolean bool = TextUtils.isEmpty(str);
    Uri localUri = null;
    if (!bool) {
      localUri = Uri.parse(str);
    }
    localIntent.putExtra("android.intent.extra.ringtone.EXISTING_URI", localUri);
    localIntent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", this.b);
    if (this.b) {
      localIntent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(this.a));
    }
    localIntent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", this.c);
    localIntent.putExtra("android.intent.extra.ringtone.TYPE", this.a);
    localIntent.putExtra("android.intent.extra.ringtone.TITLE", this.r);
    kfb localkfb = this.m.b;
    if (localkfb != null)
    {
      localkfb.a(localIntent, this.d);
      return;
    }
    this.m.a.startActivityForResult(localIntent, this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kfv
 * JD-Core Version:    0.7.0.1
 */