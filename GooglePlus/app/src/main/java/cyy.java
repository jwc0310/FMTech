import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.plus.phone.AddProfilePhotoSpringboardActivity;
import com.google.android.apps.plus.service.EsService;

public final class cyy
  implements hej, mbo, mfd
{
  private Context a;
  private final bw b;
  private git c;
  
  cyy(Activity paramActivity, mek parammek)
  {
    this.b = ((bp)paramActivity).b.a.d;
    parammek.a(this);
  }
  
  cyy(bk parambk, mek parammek)
  {
    this.b = parambk.x;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.c = ((git)parammbb.a(git.class));
    this.a = paramContext;
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, hek paramhek, byte[] paramArrayOfByte)
  {
    boolean bool1 = true;
    int i;
    if (!EsService.a(paramString1))
    {
      i = this.c.c();
      if (!paramBoolean2) {
        break label82;
      }
      Context localContext3 = this.a;
      Intent localIntent = EsService.e.a(localContext3, EsService.class);
      localIntent.putExtra("op", 17);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("aid", paramString1);
      EsService.a(localContext3, localIntent);
    }
    label260:
    label264:
    for (;;)
    {
      return;
      label82:
      boolean bool2;
      Context localContext1;
      int j;
      if (paramhek != null)
      {
        Context localContext2 = this.a;
        int k = this.c.c();
        if ((paramhek != null) && (efj.a(localContext2, paramBoolean1, k)))
        {
          paramhek.m();
          bool2 = bool1;
          EsService.a(this.a, i, paramString1, bool2, paramArrayOfByte);
          localContext1 = this.a;
          j = this.c.c();
          if (((giz)mbb.a(localContext1, giz.class)).a(j).b("profile_photo_url") == null) {
            break label260;
          }
        }
      }
      for (;;)
      {
        if ((bool1) || (!AddProfilePhotoSpringboardActivity.a(localContext1, j))) {
          break label264;
        }
        gzj.a(localContext1, new boj(localContext1, j, paramString2, paramString3));
        return;
        bool2 = false;
        break;
        bool2 = efj.a(this.a, this.b, this.c.c(), paramBoolean1, "plus_one_promo");
        break;
        bool1 = false;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cyy
 * JD-Core Version:    0.7.0.1
 */