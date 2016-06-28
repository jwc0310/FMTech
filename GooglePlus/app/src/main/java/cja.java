import android.content.Intent;
import java.util.ArrayList;

final class cja
  implements guf
{
  cja(ciy paramciy) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    int i;
    if (paramInt == -1)
    {
      i = paramIntent.getIntExtra("category_index", -1);
      if (i >= 0) {}
    }
    else
    {
      return;
    }
    ArrayList localArrayList = paramIntent.getStringArrayListExtra("selected_circle_ids");
    this.a.a(i, localArrayList);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cja
 * JD-Core Version:    0.7.0.1
 */