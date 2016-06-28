import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.RectF;
import com.google.android.apps.photoeditor.fragments.PhotoEditorActivity;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.core.FilterChainNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class alo
  implements DialogInterface.OnClickListener
{
  public alo(PhotoEditorActivity paramPhotoEditorActivity, bw parambw) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    aiq localaiq;
    boolean bool;
    FilterChain localFilterChain;
    if (paramInt == -1)
    {
      localaiq = this.b.d.a;
      if (!localaiq.i)
      {
        bool = true;
        localaiq.j = bool;
        localFilterChain = localaiq.h;
        if (!localFilterChain.a()) {
          break label213;
        }
      }
    }
    label213:
    for (FilterChainNode localFilterChainNode1 = localFilterChain.getFilterNodeAt(0);; localFilterChainNode1 = null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localFilterChain.h.iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          FilterChainNode localFilterChainNode2 = (FilterChainNode)localIterator.next();
          if (localFilterChainNode2 != localFilterChainNode1)
          {
            localArrayList.add(localFilterChainNode2);
            continue;
            bool = false;
            break;
          }
        }
      }
      localFilterChain.h.removeAll(localArrayList);
      localFilterChain.a.set(0.0F, 0.0F, 1.0F, 1.0F);
      localFilterChain.b = 0.0F;
      localFilterChain.c = 0;
      localFilterChain.d = 0;
      localFilterChain.b();
      localaiq.a(localaiq.h);
      akl localakl = (akl)this.a.a("root");
      if (localakl != null) {
        localakl.v();
      }
      this.b.b(18);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     alo
 * JD-Core Version:    0.7.0.1
 */