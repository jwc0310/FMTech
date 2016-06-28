import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

public final class hlc
  extends gzf
{
  private final int a;
  private final String b;
  
  public hlc(int paramInt, String paramString)
  {
    super("GetCollexionAudience");
    this.a = paramInt;
    this.b = paramString;
  }
  
  protected final hae a(Context paramContext)
  {
    boolean bool = true;
    Cursor localCursor = ((hhh)mbb.a(paramContext, hhh.class)).a(this.a, this.b);
    int i;
    if (localCursor.moveToFirst()) {
      i = localCursor.getColumnIndex("sharing_roster");
    }
    for (;;)
    {
      try
      {
        byte[] arrayOfByte = localCursor.getBlob(i);
        if (arrayOfByte != null)
        {
          localome = (ome)qat.b(new ome(), arrayOfByte, 0, arrayOfByte.length);
          gnb localgnb = efj.a(paramContext, this.a, localome, true);
          if (localgnb != null)
          {
            hae localhae = new hae(true);
            Bundle localBundle = localhae.a();
            localBundle.putParcelable("audience", localgnb);
            if (localome == null) {
              break label246;
            }
            if (localome.a == null)
            {
              break label246;
              localBundle.putBoolean("is_domain_restricted", bool);
              return localhae;
            }
            omf[] arrayOfomf = localome.a;
            int j = arrayOfomf.length;
            int k = 0;
            if (k < j)
            {
              omf localomf = arrayOfomf[k];
              if ((localomf.b != null) && (localomf.b.b != null))
              {
                int m = localomf.b.b.c;
                if (m == 2) {
                  continue;
                }
              }
              k++;
              continue;
            }
            bool = false;
            continue;
          }
          return new hae(false);
        }
      }
      catch (qas localqas) {}
      ome localome = null;
      continue;
      label246:
      bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlc
 * JD-Core Version:    0.7.0.1
 */