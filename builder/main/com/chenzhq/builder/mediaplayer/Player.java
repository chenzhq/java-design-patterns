package main.com.chenzhq.builder.mediaplayer;

public class Player {
	
	/**
	 * 主窗体
	 */
	private String win;
	/**
	 * 菜单
	 */
	private String menu;
	/**
	 * 播放列表
	 */
	private String list;
	/**
	 * 进度条
	 */
	private String bar;
	
	/**
	 * 私有的构造函数 只有在类的内部可以调用
	 * @param builder
	 */
	private Player(Builder builder) {
		this.win = builder.win;
		this.menu = builder.menu;
		this.list = builder.list;
		this.bar = builder.bar;
	}
	StringBuilder sBuilder = new StringBuilder();
	public String getWin() {
		return win;
	}
	public void setWin(String win) {
		this.win = win;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	public String getBar() {
		return bar;
	}
	public void setBar(String bar) {
		this.bar = bar;
	}
	
	
	
	@Override
	public String toString() {
		return "窗口:"+ this.win 
				+ "\n菜单:" + this.menu 
				+ "\n列表:" + this.list 
				+ "\n进度条:" + this.bar
				+ "\n";
	}



	public static class Builder {
		private String win;
		private String menu;
		private String list;
		private String bar;
		

		public Builder setWin(String win) {
			this.win = win;
			return this;
		}


		public Builder setMenu(String menu) {
			this.menu = menu;
			return this;
		}


		public Builder setList(String list) {
			this.list = list;
			return this;
		}


		public Builder setBar(String bar) {
			this.bar = bar;
			return this;
		}


		public Player build() {
			return new Player(this);
		}
	}
}
