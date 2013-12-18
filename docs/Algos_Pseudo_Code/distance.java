public void updateDistance(Runner r){
	
	if(r.getTimer() > TIMEMAX){
		r.resetCounter();
	}
	else if(r.getCounter() > MAXDISTANCE){
		//Do nothing
	}
	else{
		r.setCounter(r.getCounter() + 1 );
	}

}

public void arrive(Runner r){
	if(r.getTimer() > TIMEMAX){
		r.resetCounter();
	}
	else if(r.getCounter() < (MAXDISTANCE * 1.15) && r.getCounter() > MAXDISTANCE){
		r.setValidDistance(r.getValidDistance() + r.getCounter());
		r.resetCounter();
	}
}

public String affiche(Runner r){
	if(currentTime < BEGINTIME){
		return currentTime.toString();
	}
	else if(currentTime >= BEGINTIME - 10 && currentTime <= BEGINTIME){
		return (BEGINTIME-currentTime).toString();
	}
	else{
		return getDistance(r);
	}
}