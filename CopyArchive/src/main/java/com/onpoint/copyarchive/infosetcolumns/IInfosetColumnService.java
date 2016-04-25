package com.onpoint.copyarchive.infosetcolumns;

import java.util.List;

public interface IInfosetColumnService {
	public List<InfosetColumn> findByInfoset(int infoset);
}
