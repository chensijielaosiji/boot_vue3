package yyy;

public abstract class TemplateShopping {
		final void shoppingMethod(){
			this.scanning();
			this.choose();
			if(!iscustomerwantscallService()){
					callService();
			}
			
			this.sendGoods();
			this.computerPrice();
			this.orderPay();
			
		}

		abstract void callService();
		abstract void sendGoods();
		abstract void computerPrice();
		abstract void orderPay();
		 
		private boolean iscustomerwantscallService() {
			// TODO Auto-generated method stub
			return false;
		}

		private void scanning() {
			// TODO Auto-generated method stub
			System.out.println("浏览商品:");
		}

		private void choose() {
			// TODO Auto-generated method stub
			System.out.println("选择商品:");
		}
		
		public void showOrder() {
			System.out.println("您的订单号为:");
		}
		
}
