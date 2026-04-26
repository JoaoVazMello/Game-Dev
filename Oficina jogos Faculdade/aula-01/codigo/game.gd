extends Control

var count:float = 0
var score:int = 0

var pressed_style = StyleBoxFlat.new()

var time:float = 100

# Called when the node enters the scene tree for the first time.
func _ready() -> void:
	pass # Replace with function body.

# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta: float) -> void:
	
	if(time < 0):
		print("Fim de jogo")
		get_tree().change_scene_to_file("res://Cenas/GameOver.tscn")
	
	if(count > 0.7):
		var x = randi_range(0, 500)
		var y = randi_range(0, 500)
		
		count = 0
		$ColorRect/Button.position = Vector2(x, y)
	
	# esse count vai aumentando de acordo com o delta, sendo assim
	count += delta
	time -= delta
	
	$ColorRect/Label2.text = "Score: {0}".format([score])
	
	pass

func _on_button_button_down() -> void:
	pressed_style.bg_color = Color(0,1,0)
	$ColorRect/Button.add_theme_stylebox_override("pressed", pressed_style)
	pass # Replace with function body.

func _on_button_button_up() -> void:
	pressed_style.bg_color = Color(0,0,0)
	$ColorRect/Button.add_theme_stylebox_override("pressed", pressed_style)
	score += 1
	pass # Replace with function body.
