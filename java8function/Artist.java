package java8function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public final class Artist{
  private String name;
  private List<Artist> members;
  private String nationality;

  public Artist(String name,String nationality){
	this(name,Collections.emptyList(),nationality);
  }

  public Artist(String name,List<Artist> members,String nationality){
	Objects.requireNonNull(name);
	Objects.requireNonNull(members);
	Objects.requireNonNull(nationality);
    this.name=name;
	this.members=members;
	this.nationality=nationality;
  }

  public String getName(){
	return name;
  }

//  public List<Artist> getMembers(){
//	return this.members;
  public Stream<Artist> getMembers(){
  return members.stream();
  }

  public boolean isSolo(){
	return members.isEmpty();
  }

  public boolean isFrom(String nationality){
	return this.nationality.equals(nationality);
  }

  public String toString(){
	return name;
  }

  public  Artist copy(){
	List<Artist> members=getMembers().map(Artist::copy).collect(toList());
    //List<Artist> members=new ArrayList<Artist>();
	//for(Artist artist : getMembers())
	//  members.add(artist.copy());

	return new Artist(name,members,nationality);
  }
}


