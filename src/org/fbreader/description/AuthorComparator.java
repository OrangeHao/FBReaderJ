package org.fbreader.description;

class AuthorComparator {
	
	public boolean operator(Author a1, Author a2) {
		return a1.sortKey().equals(a2.sortKey());
	}
}
