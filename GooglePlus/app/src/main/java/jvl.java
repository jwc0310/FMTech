import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class jvl
  implements AdapterView.OnItemClickListener
{
  jvl(jvj paramjvj) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    jws localjws = (jws)paramAdapterView.getItemAtPosition(paramInt);
    ((hem)this.a.bo.a(hem.class)).a(this.a.f(), ((git)this.a.bo.a(git.class)).c(), localjws.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvl
 * JD-Core Version:    0.7.0.1
 */