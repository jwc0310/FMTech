import android.content.Intent;
import com.google.android.libraries.social.collexions.impl.share.OnItemSelectedSpinner;

final class hpc
  implements guf
{
  hpc(hpb paramhpb) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    this.a.b = true;
    if ((paramInt == -1) && (paramIntent != null)) {
      this.a.a = ((gnb)paramIntent.getParcelableExtra("extra_acl"));
    }
    for (;;)
    {
      ((hpe)this.a.c.getAdapter()).notifyDataSetChanged();
      this.a.c.a(hpb.a(this.a, (hpd)this.a.c.getSelectedItem()));
      return;
      if (this.a.a == null) {
        this.a.a(this.a.N);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hpc
 * JD-Core Version:    0.7.0.1
 */