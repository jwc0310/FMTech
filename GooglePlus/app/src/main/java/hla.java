import android.content.Context;
import android.os.Parcel;
import android.util.Base64;

public final class hla
  extends gzf
{
  private final int a;
  
  public hla(int paramInt)
  {
    super("FetchDefaultCollexionAclTask");
    this.a = paramInt;
  }
  
  protected final hae a(Context paramContext)
  {
    hkg localhkg = new hkg(paramContext, new kch().a(paramContext, this.a).a());
    localhkg.i();
    hhn localhhn = (hhn)mbb.a(paramContext, hhn.class);
    qat localqat1;
    qat localqat2;
    label79:
    qat localqat3;
    if (!localhkg.n())
    {
      if (!localhkg.x) {
        break label219;
      }
      localqat1 = localhkg.w;
      if (localqat1 != null)
      {
        if (!localhkg.x) {
          break label225;
        }
        localqat2 = localhkg.w;
        if (((mte)localqat2).a != null)
        {
          if (!localhkg.x) {
            break label231;
          }
          localqat3 = localhkg.w;
          label103:
          if (((mte)localqat3).a.a != null) {
            if (!localhkg.x) {
              break label237;
            }
          }
        }
      }
    }
    label219:
    label225:
    label231:
    label237:
    for (qat localqat4 = localhkg.w;; localqat4 = null)
    {
      if (((mte)localqat4).a.a.a != null) {
        break label243;
      }
      if (((ixf)mbb.a(paramContext, ixf.class)).a()) {
        ((hot)mbb.a(paramContext, hot.class)).a(this.a, System.currentTimeMillis());
      }
      localhhn.a(((hho)mbb.a(paramContext, hho.class)).g(), 2);
      return new hae(0, localhkg.q, null);
      localqat1 = null;
      break;
      localqat2 = null;
      break label79;
      localqat3 = null;
      break label103;
    }
    label243:
    int i = this.a;
    if (localhkg.x) {}
    gnb localgnb;
    for (qat localqat5 = localhkg.w;; localqat5 = null)
    {
      localgnb = efj.a(paramContext, i, ((mte)localqat5).a.a.a, true);
      if (localgnb != null) {
        break;
      }
      localhhn.a(((hho)mbb.a(paramContext, hho.class)).g(), 2);
      return new hae(false);
    }
    hot localhot = (hot)mbb.a(paramContext, hot.class);
    int j = this.a;
    Parcel localParcel = Parcel.obtain();
    localgnb.writeToParcel(localParcel, 0);
    byte[] arrayOfByte = localParcel.marshall();
    localParcel.recycle();
    localhot.a.b(j).b("default_collexion_acl", Base64.encodeToString(arrayOfByte, 0)).d();
    localhot.a(this.a, System.currentTimeMillis());
    localhhn.a(((hho)mbb.a(paramContext, hho.class)).g(), 3);
    return new hae(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hla
 * JD-Core Version:    0.7.0.1
 */