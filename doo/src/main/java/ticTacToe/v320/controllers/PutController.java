package ticTacToe.v320.controllers;

import ticTacToe.v320.models.Error;
import ticTacToe.v320.models.Game;
import ticTacToe.v320.models.Coordinate;
import ticTacToe.v320.views.TicTacToeView;

public class PutController extends ColocateController {

	PutController(Game game, CoordinateController coordinateController) {
		super(game, coordinateController);
	}

	@Override
	public void put(Coordinate target) {
		assert this.validateTarget(target) == null;
		super.put(target);
	}
	
	public Error validateTarget(Coordinate target) {
		return super.validateTarget(target);
	}

	@Override
	public void accept(TicTacToeView ticTacToeView) {
		ticTacToeView.visit(this);
	}
}
