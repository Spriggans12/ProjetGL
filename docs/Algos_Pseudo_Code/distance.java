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

//SWP 
pour l'évenement dont un runner passe la ligne d'arrivée faire : 
	récupérer la distance dont le runner a couru.
	récupérer le temps.
	grouper les infos dans un objet runner.
	synchroniser les informations de runner avec le serveur en appelant la méthode arrive().
	
pour chaque kilomètre dont le runner court faire : 
	récupérer la distance dont le runner a couru.
	récupérer le temps.
	grouper les infos dans un objet runner.
	synchroniser les informations de runner avec le serveur en appelant la méthode updateDistance().











