import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

public final class let
  implements lfc, mbo, mfd
{
  private final bk a;
  private final les b;
  private Context c;
  private int d;
  private kye e;
  private kyd f;
  
  public let(bk parambk, mek parammek, les paramles)
  {
    this.a = parambk;
    this.b = paramles;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = paramContext;
    this.d = ((git)parammbb.a(git.class)).c();
    this.e = ((kye)parammbb.a(kye.class));
    this.f = ((kyd)parammbb.a(kyd.class));
  }
  
  public final void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      Intent localIntent = ((kyp)mbb.a(this.c, kyp.class)).a(this.d, paramString);
      ay.a(this.a.f(), localIntent, ((gvj)mbb.a(this.c, gvj.class)).a());
      return;
    }
    Log.e("MemberListActionsMixin", "Got empty gaiaId for member.");
  }
  
  public final void a(String paramString1, String paramString2, int paramInt)
  {
    int i = 1;
    les localles = this.b;
    String str = this.e.N();
    int j = this.f.O();
    if ((j == 2) || (j == i)) {}
    for (;;)
    {
      if (i != 0)
      {
        lew locallew = new lew();
        Bundle localBundle = new Bundle();
        localBundle.putString("square_id", str);
        localBundle.putString("qualified_id", paramString1);
        localBundle.putString("user_name", paramString2);
        localBundle.putInt("user_member_type", paramInt);
        localBundle.putInt("viewer_member_type", j);
        locallew.f(localBundle);
        locallew.a(localles.a.h(), null);
      }
      return;
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     let
 * JD-Core Version:    0.7.0.1
 */