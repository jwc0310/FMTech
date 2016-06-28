import android.content.res.Resources;
import com.google.android.apps.plus.fragments.AddProfilePhotoSpringboardFragment;
import com.google.android.apps.plus.service.EsService;

public final class bwe
  implements Runnable
{
  public bwe(AddProfilePhotoSpringboardFragment paramAddProfilePhotoSpringboardFragment, byte[] paramArrayOfByte, gxz paramgxz) {}
  
  public final void run()
  {
    AddProfilePhotoSpringboardFragment localAddProfilePhotoSpringboardFragment = this.c;
    byte[] arrayOfByte = this.a;
    localAddProfilePhotoSpringboardFragment.d = Integer.valueOf(EsService.a(localAddProfilePhotoSpringboardFragment.f(), localAddProfilePhotoSpringboardFragment.a.c(), arrayOfByte));
    int i = aau.tf;
    coo.a(null, localAddProfilePhotoSpringboardFragment.g().getString(i), false, false).a(localAddProfilePhotoSpringboardFragment.x, "pending");
    gxx localgxx = (gxx)this.c.bo.a(gxx.class);
    gxw localgxw = new gxw(this.c.bn);
    localgxw.c = this.b;
    localgxw.d = gya.H;
    localgxx.a(localgxw);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bwe
 * JD-Core Version:    0.7.0.1
 */