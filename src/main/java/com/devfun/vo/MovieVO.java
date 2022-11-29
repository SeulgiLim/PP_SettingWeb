package com.devfun.vo;

	public class MovieVO {
	     
		//private int movie_id;
	    private String movie_name;
	    private String director;
	    private String type;
	    //private String moviecol;
	     
	    
//	    public int getmovie_id() {
//	        return movie_id;
//	    }
//	    public void setmovie_id(int movie_id) {
//	        this.movie_id = movie_id;
//	    }
	    
	    
	    public String getmovie_name() {
	        return movie_name;
	    }
	    public void setmovie_name(String movie_name) {
	        this.movie_name = movie_name;
	    }
	    
	    
	    public String getdirector() {
	        return director;
	    }
	    public void setdirector(String director) {
	        this.director = director;
	    }
	    
	   
	    
	    public String gettype() {
	    	return type;
	    }
	    public void settype(String type) {
	    	this.type = type;
	    }
	    
//	    public String getmoviecol() {
//	    	return moviecol;
//	    }
//	    public void setmoviecol(String moviecol) {
//	    	this.moviecol = moviecol;
//	    }
	}

	    


// VO는 DB에서 가져온 데이터를 담아 전달하거나, 화면에서 온 데이터를 DB로 전달해주는 역할을 하는 클래스.
// 테이블의 칼럼에 해당하는 변수를 만들어준다. 그리고 위 처럼 값을 넣거나 가져올 수 있도록 Setter/Getter 메서드를 만든다.