import android.content.Intent;

final class drh
  implements guf
{
  drh(drg paramdrg) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    if ((paramInt == -1) && (paramIntent != null))
    {
      gnb localgnb = (gnb)paramIntent.getParcelableExtra("extra_acl");
      if ((localgnb != null) && (!localgnb.equals(this.a.a.a)))
      {
        this.a.a.a = localgnb;
        this.a.v();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     drh
 * JD-Core Version:    0.7.0.1
 */