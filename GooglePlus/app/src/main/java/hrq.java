import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

public final class hrq
  implements hrr, hrs, hrw
{
  private final LinkedHashSet<Parcelable> a = new LinkedHashSet();
  private final ArrayList<hru> b = new ArrayList();
  private HashMap<Integer, HashMap<String, Parcelable>> c = new HashMap();
  
  public hrq()
  {
    this(null);
  }
  
  public hrq(mek parammek)
  {
    if (parammek != null) {
      parammek.a(this);
    }
  }
  
  private final void a(int paramInt, Parcelable paramParcelable)
  {
    for (int i = 0; i < this.b.size(); i++) {
      ((hru)this.b.get(i)).a(paramInt, paramParcelable);
    }
  }
  
  private final void a(Integer paramInteger, Collection<Parcelable> paramCollection)
  {
    for (int i = 0; i < this.b.size(); i++) {
      ((hru)this.b.get(i)).a(paramInteger, paramCollection);
    }
  }
  
  private final void d(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof hrt))
    {
      hrt localhrt = (hrt)paramParcelable;
      if (this.c.get(Integer.valueOf(170)) == null) {
        this.c.put(Integer.valueOf(170), new HashMap());
      }
      String str = localhrt.a(10);
      if (!TextUtils.isEmpty(str)) {
        ((HashMap)this.c.get(Integer.valueOf(170))).put(str, (Parcelable)localhrt);
      }
    }
  }
  
  public final void a()
  {
    this.a.clear();
    this.c.clear();
    a(hrv.c, null);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.a.addAll(paramBundle.getParcelableArrayList("com.google.android.libraries.social.content.multi.selection.DefaultItemSelection.values"));
      this.c = ((HashMap)paramBundle.getSerializable("com.google.android.libraries.social.content.multi.selection.DefaultItemSelection.selectionIndexes"));
    }
  }
  
  public final void a(hru paramhru)
  {
    this.b.add(paramhru);
  }
  
  public final void a(Collection<Parcelable> paramCollection)
  {
    if (this.a.addAll(paramCollection))
    {
      ArrayList localArrayList = new ArrayList(paramCollection);
      for (int i = 0; i < localArrayList.size(); i++) {
        d((Parcelable)localArrayList.get(i));
      }
      a(hrv.a, paramCollection);
    }
  }
  
  public final boolean a(int paramInt, String paramString)
  {
    HashMap localHashMap = (HashMap)this.c.get(Integer.valueOf(paramInt));
    if (localHashMap != null) {
      return localHashMap.containsKey(paramString);
    }
    return false;
  }
  
  public final boolean a(Parcelable paramParcelable)
  {
    if (this.a.add(paramParcelable))
    {
      d(paramParcelable);
      a(hrv.a, paramParcelable);
      return true;
    }
    return false;
  }
  
  public final Parcelable b(int paramInt, String paramString)
  {
    if (a(170, paramString)) {
      return (Parcelable)((HashMap)this.c.get(Integer.valueOf(170))).get(paramString);
    }
    return null;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putParcelableArrayList("com.google.android.libraries.social.content.multi.selection.DefaultItemSelection.values", (ArrayList)new ArrayList(this.a));
    paramBundle.putSerializable("com.google.android.libraries.social.content.multi.selection.DefaultItemSelection.selectionIndexes", this.c);
  }
  
  public final boolean b()
  {
    return this.a.isEmpty();
  }
  
  public final boolean b(Parcelable paramParcelable)
  {
    if (this.a.remove(paramParcelable))
    {
      if ((paramParcelable instanceof hrt))
      {
        String str = ((hrt)paramParcelable).a(10);
        if ((this.c.get(Integer.valueOf(170)) != null) && (!TextUtils.isEmpty(str)))
        {
          HashMap localHashMap = (HashMap)this.c.get(Integer.valueOf(170));
          localHashMap.remove(str);
          if (localHashMap.isEmpty()) {
            this.c.remove(Integer.valueOf(170));
          }
        }
      }
      a(hrv.b, paramParcelable);
      return true;
    }
    return false;
  }
  
  public final List<Parcelable> c()
  {
    return new ArrayList(this.a);
  }
  
  public final boolean c(Parcelable paramParcelable)
  {
    return this.a.contains(paramParcelable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hrq
 * JD-Core Version:    0.7.0.1
 */