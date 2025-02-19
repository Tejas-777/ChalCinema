import { StyleSheet} from 'react-native'
import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { NavigationContainer } from '@react-navigation/native';
import Login from './Login';
import Dashboard from './Dashboard';
import AddMovie from './AddMovie';
import AddShow from './AddShow';
import GetTheatreById from './GetTheatreById';
import AddTheatre from './AddTheatre';

export default function Launcher() {

    var Stack=createNativeStackNavigator();
  return (
    <NavigationContainer>
        <Stack.Navigator>
        <Stack.Screen name='login' component={Login} />
        <Stack.Screen name="Dashboard" component={Dashboard} />
        <Stack.Screen name="Add Movie" component={AddMovie} />
        <Stack.Screen name="Add Show" component={AddShow} />
        <Stack.Screen name="Add Theatre" component={AddTheatre} />
        <Stack.Screen name="Get Theatre By ID" component={GetTheatreById} />
        </Stack.Navigator>

    </NavigationContainer>
  )
}

const styles = StyleSheet.create({})