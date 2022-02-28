def player(board):
    Xs = 0
    Os = 0
    # simply iterate over the given 2D array and calculate how many Xs and Os are there
    for y_axis in board: 
        for x_axis in y_axis:
            if x_axis == X:
                Xs += 1
            elif x_axis == O:
                Os += 1
    # if numer of Xs is smaller or equal to Os, it is a turn for an X because it always goes first
    if Xs <= Os: 
        return X
    else:  # otherwise it is a turn for an O
        return O

def actions(board):
    possible_actions = set() # set is used just to be sure there will only be unique tuples
    for y, y_axis in enumerate(board):
        for x, x_axis in enumerate(y_axis):
            # initial implementation puts variable EMPTY in all cells, which is equal to None
            if x_axis == EMPTY: 
                possible_actions.add((y, x))
    return possible_actions

def result(board, action):
    if len(action) != 2:  # check if given action is a tuple of two elements
        raise Exception("result function: incorrect action")
    # check if given action is within the boundaries of the board (3x3)
    if action[0] < 0 or action[0] > 2 or action[1] < 0 or action[1] > 2:
        raise Exception("result function: incorrect action value")
    y, x = action[0], action[1]
    board_copy = copy.deepcopy(board) # using the imported library 'copy'
    # check if action is already there (even though we will call 'actions' before it)
    if board_copy[y][x] != EMPTY:
        raise Exception("suggested action has already been taken")
    else:  # here we use the player function to know which letter to put in the copy
        board_copy[y][x] = player(board)
    return board_copy

def winner(board):
    # Since the board is always 3x3, I believe this approach is reasonable
    for y in range(3):
        # Check horizontal lines
        if (board[y][0] == board[y][1] == board[y][2]) and (board[y][0] != EMPTY):
            return board[y][0]
        # check vertical lines
        if (board[0][y] == board[1][y] == board[2][y]) and (board[0][y] != EMPTY):
            return board[0][y]
    # Check diagonals
    if (board[0][0] == board[1][1] == board[2][2]) or (board[0][2] == board[1][1] == board[2][0]) \
            and board[1][1] != EMPTY:
        return board[1][1]
    return None

def terminal(board):
    if winner(board) == X or winner(board) == O: # check if there is a winner
        return True
    # check if there is a tie (if no cells left and neither X nor O won)
    elif EMPTY not in board[0] and EMPTY not in board[1] and EMPTY not in board[2]:
        return True
    else: # otherwise return that the game is still going on
        return False

def utility(board):
    if winner(board) == X:
        return 1
    elif winner(board) == O:
        return -1
    else:
        return 0

def minimax(board):
    if terminal(board):
        return None
    if player(board) == X:
        score = -math.inf
        action_to_take = None
        for action in actions(board):
            min_val = minvalue(result(board, action))
            if min_val > score:
                score = min_val
                action_to_take = action
        return action_to_take
    elif player(board) == O:
        score = math.inf
        action_to_take = None
        for action in actions(board):
            max_val = maxvalue(result(board, action))
            if max_val < score:
                score = max_val
                action_to_take = action
        return action_to_take

def minvalue(board):
    # if game over, return the utility of state
    if terminal(board):
        return utility(board)
    # iterate over the available actions and return the minimum out of all maximums
    max_value = math.inf  
    for action in actions(board):
        max_value = min(max_value, maxvalue(result(board, action)))
    return max_value

def maxvalue(board):
    # if game over, return the utility of state
    if terminal(board):
        return utility(board)
    # iterate over the available actions and return the maximum out of all minimums
    min_val = -math.inf
    for action in actions(board):
        min_val = max(min_val, minvalue(result(board, action)))
    return min_val