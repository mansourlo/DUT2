# user configuration manager

test_settings = {
    'theme': 'dark', 
    'notifications': 'enabled', 
    'volume': 'high',
    #'emoji': 'medium'
}

def add_setting(dictionary, settings):
    key = settings[0].lower()
    value = settings[1].lower()
    if key in dictionary:
        return "Setting '" + key +  "' already exists! Cannot add a new setting with this name."
    else:
        dictionary[key] = value
        return "Setting '" + key + "' added with value '" + value + "' successfully!"

def update_setting(dictionary, settings):
    key = settings[0].lower()
    value = settings[1].lower()
    if key in dictionary:
        dictionary[key] = value
        return "Setting '" + key + "' updated to '" + value + "' successfully!"
    else:
        return "Setting '" + key + "' does not exist! Cannot update a non-existing setting."

def delete_setting(dictionary, setting):
    key = setting.lower()
    if key in dictionary:
        dictionary.pop(key)
        return "Setting '" + key + "' deleted successfully!"
    else:
        return "Setting not found!"

def view_settings(settings: dict) -> str:

    if not settings:
        return "No settings available."
    
    output = "Current User Settings:"
    

    for key, value in settings.items():

        display_key = key.capitalize()
        output += f"\n{display_key}: {value}"
        
    return output+"\n"
               
# add_setting(test_settings, ('EMOJI', 'SMALL'))

# update_setting(test_settings, ('EMOJI', 'SMALL'))

# delete_setting(test_settings, 'THEME')


print(view_settings(test_settings))