package IteratorDemo;

public class TclTv implements Television {
	private Object[] obj = {"��������","��������"};

	@Override
	public TVIterator createIterator() {
		// TODO Auto-generated method stub
		return (TVIterator) new TclTv();
	}
	
	class TclIterator implements TVIterator{
		
		private int currentIndex = 0;

		@Override
		public void setChannel(int i) {
			// TODO Auto-generated method stub
			currentIndex = i;
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(currentIndex < obj.length) {
				currentIndex++;
			}
		}

		@Override
		public void previous() {
			// TODO Auto-generated method stub
			if(currentIndex > 0) {
				currentIndex--;
			}
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return currentIndex == obj.length;
		}

		@Override
		public Object currentChannel() {
			// TODO Auto-generated method stub
			return obj[currentIndex];
		}

		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return currentIndex == 0;
		}
		
	}

}
