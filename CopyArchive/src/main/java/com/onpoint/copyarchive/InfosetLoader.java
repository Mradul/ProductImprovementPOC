package com.onpoint.copyarchive;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.onpoint.copyarchive.infosetcolumns.InfosetColumn;
import com.onpoint.copyarchive.infosetcolumns.InfosetColumnsRepo;
import com.onpoint.copyarchive.infosets.Infoset;
import com.onpoint.copyarchive.infosets.InfosetRepo;
import com.onpoint.copyarchive.state.State;
import com.onpoint.copyarchive.state.StateRepo;

@Component
public class InfosetLoader implements ApplicationListener<ContextRefreshedEvent> {

    private InfosetRepo infosetRepo;
    private InfosetColumnsRepo infosetColRepo;
    private StateRepo stateRepo;
    private Logger log = Logger.getLogger(InfosetLoader.class);

    @Autowired
    public void setProductRepository(InfosetRepo infosetRepo) {
        this.infosetRepo = infosetRepo;
    }
    
    @Autowired
    public void setStateRepo(StateRepo stateRepo) {
        this.stateRepo = stateRepo;
    }
    @Autowired
    public void setInfosetColRepo(InfosetColumnsRepo infosetColRepo) {
        this.infosetColRepo = infosetColRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
    	State ma = new State();
    	ma.setState("Massachusetts");
    	ma.setStateAbbr("MA");
    	stateRepo.save(ma);
    	State tx = new State();
    	tx.setState("Texas");
    	tx.setStateAbbr("TX");
    	stateRepo.save(tx);
    	
    	Infoset infoset = new Infoset();
    	infoset.setInfosetName("Claims");
    	infoset.setState(ma);
    	infosetRepo.save(infoset);
    	
    	InfosetColumn ic = new InfosetColumn();
    	ic.setAlias("Claim Id");
    	ic.setInfobaseFieldname("claim_id");
    	ic.setInfoset(infoset);
    	infosetColRepo.save(ic);
    	ic = new InfosetColumn();
    	ic.setAlias("Claimant Name");
    	ic.setInfobaseFieldname("claimant_name");
    	ic.setInfoset(infoset);
    	infosetColRepo.save(ic);
    	log.info("saved");
    	infoset = new Infoset();
    	infoset.setInfosetName("ContinuedClaims");
    	infoset.setState(ma);
    	infosetRepo.save(infoset);
    	log.info("saved");
    }
}
