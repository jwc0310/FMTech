import java.util.ArrayList;

final class ljh
  extends ArrayList<owm>
{
  ljh()
  {
    add(new owm("CREATE TABLE stream_views (stream_view_id INTEGER PRIMARY KEY AUTOINCREMENT,stream_id TEXT NOT NULL,timestamp INTEGER NOT NULL,continuation_token TEXT NOT NULL);"));
    add(new owm("CREATE TABLE stream_cards (_id INTEGER PRIMARY KEY AUTOINCREMENT,card_id TEXT UNIQUE NOT NULL,card BLOB NOT NULL,timestamp INTEGER NOT NULL);"));
    add(new owm("CREATE TABLE parent_child_cards (stream_view_id INTEGER REFERENCES stream_views (stream_view_id),parent_card_id TEXT REFERENCES stream_cards (card_id),child_card_id TEXT REFERENCES stream_cards (card_id), UNIQUE (parent_card_id,child_card_id));"));
    add(new owm("CREATE INDEX parent_child_cards_index_parent_card_id ON parent_child_cards (parent_card_id);"));
    add(new owm("CREATE TABLE streams (stream_view_id INTEGER REFERENCES stream_views (stream_view_id),card_id TEXT REFERENCES stream_cards (card_id),sort_key INTEGER, UNIQUE (stream_view_id,card_id));"));
    add(new owm("CREATE INDEX streams_index_sort_key ON streams (sort_key);"));
    add(new owm("CREATE INDEX streams_index_card_id ON streams (card_id);"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ljh
 * JD-Core Version:    0.7.0.1
 */