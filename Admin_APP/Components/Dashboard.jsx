import React from 'react';
import { View, StyleSheet } from 'react-native';
import { Button, Card, Text } from 'react-native-paper';
import { MaterialIcons } from '@expo/vector-icons'; 

const Dashboard = ({ navigation }) => {
  return (
    <View style={styles.container}>
      <Text style={styles.header}>🎬 Admin Dashboard</Text>
      
      <Card style={styles.card}>
        <View style={styles.buttonContainer}>
          <Button 
            mode="contained" 
            icon="movie" 
            onPress={() => navigation.navigate('Add Movie')} 
            style={styles.button}
            labelStyle={styles.buttonLabel}
          >
            Add Movie
          </Button>

          <Button 
            mode="contained" 
            icon="calendar" 
            onPress={() => navigation.navigate('Add Show')} 
            style={styles.button}
            labelStyle={styles.buttonLabel}
          >
            Add Show
          </Button>

          <Button 
            mode="contained" 
            icon="theater" 
            onPress={() => navigation.navigate('Add Theatre')} 
            style={styles.button}
            labelStyle={styles.buttonLabel}
          >
            Add Theatre
          </Button>

          <Button 
            mode="contained" 
            onPress={() => navigation.navigate('Get Theatre By ID')} 
            style={styles.button}
            labelStyle={styles.buttonLabel}
          >
            Get Theatre by ID
          </Button>
        </View>
      </Card>
    </View>
  );
};

export default Dashboard;

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    padding: 20,
    backgroundColor: '#F0F4F8', // Light background color
  },
  header: {
    textAlign: 'center',
    fontSize: 28,
    fontWeight: 'bold',
    marginBottom: 20,
    color: '#6200EE',
  },
  card: {
    padding: 20,
    backgroundColor: 'white',
    borderRadius: 15,
    elevation: 6, // Shadow effect
  },
  buttonContainer: {
    flexDirection: 'column',
    justifyContent: 'center',
  },
  button: {
    marginVertical: 10,
    backgroundColor: '#6200EE',
    borderRadius: 10,
    height: 50,
    justifyContent: 'center',
  },
  buttonLabel: {
    fontSize: 16,
  },
});
