import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

public final class hvj
{
  private final gxx a;
  private final Context b;
  private Bundle c;
  private Bundle d;
  
  private hvj(Context paramContext, gxx paramgxx)
  {
    this.b = paramContext;
    this.a = paramgxx;
  }
  
  public hvj(Context paramContext, gxx paramgxx, String paramString, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, hgh paramhgh)
  {
    this(paramContext, paramgxx);
    if ((paramArrayList1 != null) && (!paramArrayList1.isEmpty()))
    {
      if (paramhgh != null)
      {
        this.c = a(Integer.valueOf(paramhgh.R_()));
        a(paramhgh, this.c);
        ArrayList localArrayList2 = new ArrayList(1);
        localArrayList2.add(paramString);
        this.c.putStringArrayList("extra_participant_ids", localArrayList2);
        this.c.putStringArrayList("extra_circle_ids", paramArrayList1);
      }
    }
    else if ((paramArrayList2 != null) && (!paramArrayList2.isEmpty()))
    {
      if (paramhgh == null) {
        break label187;
      }
      this.d = a(Integer.valueOf(paramhgh.R_()));
      a(paramhgh, this.d);
    }
    for (;;)
    {
      ArrayList localArrayList1 = new ArrayList(1);
      localArrayList1.add(paramString);
      this.d.putStringArrayList("extra_participant_ids", localArrayList1);
      this.d.putStringArrayList("extra_circle_ids", paramArrayList2);
      return;
      this.c = new Bundle();
      break;
      label187:
      this.d = new Bundle();
    }
  }
  
  private static Bundle a(Integer paramInteger)
  {
    Bundle localBundle = new Bundle();
    if (paramInteger != null) {
      localBundle.putInt("extra_circle_mutate_location_id", paramInteger.intValue());
    }
    return localBundle;
  }
  
  public static hgh a(int paramInt1, int paramInt2)
  {
    int i = b(paramInt1);
    Integer localInteger;
    switch (paramInt1)
    {
    default: 
      localInteger = null;
    }
    for (;;)
    {
      return new hvk(i, localInteger, Integer.valueOf(paramInt2));
      localInteger = Integer.valueOf(103);
      continue;
      localInteger = Integer.valueOf(105);
    }
  }
  
  public static hgh a(int paramInt1, int paramInt2, Integer paramInteger)
  {
    Integer localInteger = null;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      return new hvk(paramInt2, localInteger, paramInteger);
      paramInt2 = 7;
      localInteger = Integer.valueOf(104);
      continue;
      paramInt2 = 93;
      localInteger = Integer.valueOf(103);
      continue;
      paramInt2 = 169;
      localInteger = Integer.valueOf(105);
      continue;
      paramInt2 = 90;
      localInteger = Integer.valueOf(106);
      continue;
      paramInt2 = 232;
      localInteger = Integer.valueOf(124);
      continue;
      paramInt2 = 114;
      localInteger = null;
      continue;
      paramInt2 = 216;
      localInteger = null;
    }
  }
  
  public static hvj a(Context paramContext, gxx paramgxx, Bundle paramBundle)
  {
    if ((paramBundle != null) && ((paramBundle.containsKey("cmclh_add_log_bundle")) || (paramBundle.containsKey("cmclh_remove_log_bundle"))))
    {
      hvj localhvj = new hvj(paramContext, paramgxx);
      localhvj.c = paramBundle.getBundle("cmclh_add_log_bundle");
      localhvj.d = paramBundle.getBundle("cmclh_remove_log_bundle");
      return localhvj;
    }
    return null;
  }
  
  private static void a(hgh paramhgh, Bundle paramBundle)
  {
    Integer localInteger1 = paramhgh.B();
    if (localInteger1 != null) {
      paramBundle.putInt("extra_promo_type", localInteger1.intValue());
    }
    Integer localInteger2 = paramhgh.C();
    if (localInteger2 != null) {
      paramBundle.putInt("extra_promo_group_id", localInteger2.intValue());
    }
  }
  
  public static int b(int paramInt)
  {
    int i = 66;
    switch (paramInt)
    {
    default: 
      i = 0;
    case 5: 
    case 6: 
      return i;
    case 8: 
      return 69;
    case 1: 
      return 232;
    case 2: 
      return 93;
    case 12: 
      return 194;
    case 13: 
      return 231;
    case 14: 
      return 195;
    case 3: 
      return 64;
    case 4: 
      return 65;
    case 7: 
      return 169;
    case 9: 
      return 127;
    case 10: 
      return 14;
    }
    return 13;
  }
  
  public final void a(int paramInt)
  {
    if (this.c != null)
    {
      gxx localgxx2 = this.a;
      gxw localgxw2 = new gxw(this.b);
      localgxw2.c = gxz.bG;
      Bundle localBundle2 = this.c;
      if (localBundle2 != null) {
        localgxw2.h.putAll(localBundle2);
      }
      localgxx2.a(localgxw2);
      this.c = null;
    }
    if (this.d != null)
    {
      gxx localgxx1 = this.a;
      gxw localgxw1 = new gxw(this.b, paramInt);
      localgxw1.c = gxz.bH;
      Bundle localBundle1 = this.d;
      if (localBundle1 != null) {
        localgxw1.h.putAll(localBundle1);
      }
      localgxx1.a(localgxw1);
      this.d = null;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    paramBundle.putBundle("cmclh_add_log_bundle", this.c);
    paramBundle.putBundle("cmclh_remove_log_bundle", this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvj
 * JD-Core Version:    0.7.0.1
 */