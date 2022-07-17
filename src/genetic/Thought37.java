package genetic;
import java.util.ArrayList;
class Thought37 extends Thought{
private static ArrayList<Thought37> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 384.66305673322495;
private double fd1 = 519.79472297398;
private Thought fo0 = null;
private Thought fo1 = null;
Thought37 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought37 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought37 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought37 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought37 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought37 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought37 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought37 instance = new Thought37 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3();
}
    fb0 = fd0 < fd1;
        fb1 = !fb0;
    if (fb1) {
        double ld0 = 881.4648980726013;
        ld0 = fd0 - fd1;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fb0 = fb1 && fb0;
if(fo0 != null){
          fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought141.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    Output.points[1][0] += fd0;
    double ld2 = 514.7835547398493;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    ld2 *= -1;
    fd0 *= -1;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd1 = fo0.m3(ld2, fd0, fd1, ld2, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ld2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad2 = ad3 - ad4;
    fb1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought108.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    ad4 *= -1;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
    fd0 = fd1 + ad1;
    lb2 = ad2 > ad3;
    Thought lo3 = Thought361.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb4 = false;
    double ld5 = 349.8317956948339;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
    ab3 = !ab4;
    Thought lo0 = Thought26.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
    double ld1 = 829.2722659672022;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought350.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    ld1 = ad1 - ad2;
    Output.points[1][1] += ad3;
    ab1 = ab2 || ab3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    Output.points[1][2] -= fd0;
    fd1 *= -1;
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    Thought lo3 = Thought18.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld1, ad1);
}
    boolean lb4 = false;
    Output.points[1][3] += ad2;
    boolean lb5 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    if (fb1) {
        Output.points[1][4] -= fd0;
        Output.points[1][5] += fd1;
        double ld0 = 131.34175221948448;
        } else {
        boolean lb1 = false;
        boolean lb2 = true;
        if (lb1) {
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
            } else {
            boolean lb3 = false;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought104.getInstance(fb1, fb0, fb1, fb0);
    Output.points[1][6] -= ad1;
    Thought lo1 = Thought269.getInstance(ao1, ao2, ao3, ao4);
    ad2 *= -1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, lb3, fb0, fb1, lb2);
}
    Thought lo4 = Thought32.getInstance(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb2);
    if (lb3) {
        Thought lo5 = Thought328.getInstance();
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought62.getInstance(ao2, ao3, ao4, fo0);
    Output.points[1][7] += fd1;
        ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
    Thought lo1 = Thought113.getInstance(fd0, fd1, fd0, fd1);
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
    Output.points[1][8] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m3();
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        ab2 = ad2 < ad3;
        boolean lb0 = true;
        double ld1 = 561.6265911827037;
        boolean lb2 = true;
        double ld3 = 426.10127924290384;
        ab1 = ab2 && ab3;
        boolean lb4 = false;
        ad2 = ad3 + ad4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ld3, ab3, ab4, fb0, fb1);
}
        lb0 = !lb2;
        Thought lo5 = Thought246.getInstance(lb4, ab1, ab2, ab3);
        double ld6 = 81.00453962929363;
        ab4 = fb0 && fb1;
        lb0 = ld6 < ad1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        if (lb2) {
            lb4 = ad2 > ad3;
if(ao1 != null){
              ao1.m2(ad4, fd0, fd1, ld1);
}
if(ao2 != null){
              ab1 = ao2.m2(ao3, ao4, fo0, fo1, ld3, ld6, ad1, ad2);
}
            ad3 *= -1;
if(ao1 != null){
              ao1.m1(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
            double ld7 = 246.36342121637423;
            fb1 = !lb0;
            ld1 = ld3 + ld6;
            } else if (lb2) {
            ad2 *= -1;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    double ld1 = 351.15244019006974;
    Thought lo2 = Thought78.getInstance(fb1, lb0, fb0, fb1);
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    Thought lo4 = Thought162.getInstance(fd0, fd1, ld1, fd0);
    lb3 = fb0 || fb1;
    fd1 *= -1;
    boolean lb5 = false;
    ld1 = fd0 + fd1;
    double ld6 = 811.4677052388524;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld6, fd0, fd1);
}
    lb3 = ld1 < ld6;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo0.m3(ld6, fd0, fd1, ld1, lb5, fb0, fb1, lb0);
}
    lb3 = !lb5;
    ld6 = fd0 + fd1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 245.71930938368197;
    lb0 = ld1 < fd0;
    ab1 = fd1 < ld1;
    Thought lo2 = Thought132.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    fd0 = fd1 - ld1;
    fb1 = fd0 < fd1;
    lb0 = !ab1;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = true;
    ab1 = ab2 || ab3;
    double ld4 = 646.1018932259906;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    Output.points[2][0] -= ld4;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fb1 = fd1 < ad1;
    ad2 *= -1;
    boolean lb0 = true;
    ad3 *= -1;
    lb0 = !fb0;
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
    if (fb1) {
        boolean lb1 = false;
        Output.points[2][1] += ad4;
        fd0 *= -1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          lb1 = fo0.m2(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb1);
}
        double ld2 = 34.79071210900873;
        if (lb0) {
            fb0 = fb1 && lb1;
            double ld3 = 948.2668999989891;
            Thought lo4 = Thought231.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb1);
            lb0 = fb0 && fb1;
            lb1 = !lb0;
            ld2 *= -1;
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3();
}
    ab1 = !ab2;
    ab3 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 334.89837669183316;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought318.getInstance(fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ad3 = ad4 + fd0;
    Thought lo3 = Thought104.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    ld1 = ad1 - ad2;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    Thought lo0 = Thought269.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought75.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
    boolean lb2 = false;
if(ao1 != null){
      lb2 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb2, fb0);
}
    fb1 = fd0 < fd1;
    lb2 = fb0 && fb1;
    lb2 = !fb0;
    double ld3 = 361.1774257376615;
    Output.points[2][2] -= ld3;
    fb1 = lb2 || fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 476.8812403732426;
    Thought lo1 = Thought230.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ld0;
    double ld2 = 343.1758511204378;
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    double ld3 = 699.3051512076682;
    fb1 = ld2 < ld3;
    fb0 = ad1 > ad2;
    double ld4 = 712.9887058936016;
    ad2 = ad3 - ad4;
    fb1 = !fb0;
    double ld5 = 442.8290818762614;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0);
}
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, ld3, ld4, ld5, ad1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + ld2;
    Thought lo6 = Thought54.getInstance();
    boolean lb7 = false;
    fb0 = fb1 && lb7;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld3, ld4, ld5, ad1, fb1, lb7, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(lb7, fb0, fb1, lb7);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought366.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Output.points[2][3] += fd0;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought246.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    Thought lo2 = Thought349.getInstance(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
    Thought lo3 = Thought87.getInstance();
    boolean lb4 = true;
    ab3 = ab4 || fb0;
    fb1 = fd0 < fd1;
    lb4 = !ab1;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb5 = false;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb4, lb5);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo6 = Thought171.getInstance(fd1, fd0, fd1, fd0);

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab3 = fo1.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    if (ab2) {
        double ld0 = 468.1182543258798;
        ad3 = ad4 - fd0;
        ab3 = fd1 > ld0;
        Thought lo1 = Thought56.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
        ad1 = ad2 - ad3;
        ab2 = ab3 && ab4;
        boolean lb2 = false;
if(fo0 != null){
          fo0.m3();
}
        Output.points[2][4] += ad4;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1, ab4, fb0, fb1, lb2);
}
        ab1 = ad2 < ad3;
        Thought lo3 = Thought300.getInstance(ab2, ab3, ab4, fb0);
        fb1 = ad4 > fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[2][5] -= fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 || ab4;
    double ld0 = 960.1120641060479;
    double ld1 = 306.7218807346905;
    ld0 = ld1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ld1, fd0);
}
    fd1 *= -1;
    fb1 = ab1 || ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(ld0, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ld0 < ld1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    ld1 = fd0 + fd1;
    boolean lb3 = false;
    ab1 = ab2 && ab3;
    ld0 *= -1;
    ld1 = fd0 - fd1;
    ab4 = ld0 < ld1;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][6] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 91.37586576588865;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    boolean lb1 = true;
    if (fb0) {
        fd0 = fd1 + ld0;
        ad1 *= -1;
        boolean lb2 = true;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb1);
}
        Output.points[2][7] -= ad2;
if(fo1 != null){
          fb0 = fo1.m2();
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb2, lb1, fb0);
}
        } else if (lb1) {
}
Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    Output.points[2][8] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    fb1 = !lb0;
    Thought lo1 = Thought360.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    boolean lb3 = false;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb2, lb3);
}
    ab1 = !ab2;
    boolean lb4 = false;
    ab2 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
        boolean lb5 = false;
        Thought lo6 = Thought206.getInstance(lb0, lb2, lb3, lb4);
        ab1 = fd1 < ad1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Output.points[3][0] += fd0;
    double ld0 = 946.4672578776593;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 *= -1;
    Output.points[3][1] += fd1;
    boolean lb1 = true;
    boolean lb2 = true;
    boolean lb3 = false;
    ld0 = fd0 + fd1;
    Output.points[3][2] += ld0;
    lb1 = !lb2;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
    fb0 = ad3 > ad4;
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    ad2 *= -1;
    if (fb0) {
        ad3 = ad4 + fd0;
        fd1 = ad1 - ad2;
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
        fb1 = fb0 || fb1;
        fb0 = fb1 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
        Output.points[3][3] -= ad2;
        ad3 = ad4 - fd0;
        fb1 = fb0 && fb1;
        fb0 = fd1 < ad1;
        ad2 = ad3 + ad4;
        fb1 = !fb0;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought131.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    Thought lo1 = Thought160.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb1 = ab1 || ab2;
    double ld2 = 919.0747517732098;
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < ld2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab4 = !fb0;
    fd0 *= -1;
    double ld3 = 657.8108285576449;
    double ld4 = 141.45935660108165;
    Thought lo5 = Thought126.getInstance(ld4, fd0, fd1, ld2);

Thought.STACK_COUNTER++;
return ld3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought155.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought172.getInstance(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    ab4 = ad3 < ad4;
if(ao4 != null){
      fb0 = ao4.m2();
}
    double ld3 = 922.7221014079381;
    fb1 = lb2 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought182.getInstance(fb1, lb2, ab1, ab2);
    Thought lo5 = Thought301.getInstance(fo0, fo1, ao1, ao2);
    ab3 = ab4 && fb0;
    fb1 = !lb2;
    ad1 = ad2 - ad3;
    boolean lb6 = true;
    Output.points[3][4] -= ad4;
    fd0 *= -1;
    lb6 = fd1 > ld3;
    Thought lo7 = Thought309.getInstance(ad1, ad2, ad3, ad4);
    if (ab1) {
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld3, ad1);
}
        ab2 = ab3 && ab4;
}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][5] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    double ld0 = 741.2454557839268;
    Thought lo1 = Thought46.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought175.getInstance(fb1, fb0, fb1, fb0);
    fd1 = ld0 + fd0;
    double ld3 = 377.6799221141491;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][6] += fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 < fd1;
    double ld0 = 538.0854686411097;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    ld0 *= -1;
    Output.points[3][7] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought148.getInstance(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    double ld2 = 762.667695629326;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ld2 = fo1.m3();
}
    fb0 = fb1 && ab1;
    fd0 = fd1 - ld0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ld2 > fd0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought8.getInstance(fb1, fb0, fb1, fb0);
    ad2 = ad3 + ad4;
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        fb1 = fb0 && fb1;
        Thought lo1 = Thought64.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
        fb0 = !fb1;
        fb0 = !fb1;
        fb0 = !fb1;
        fd0 *= -1;
        Output.points[3][8] += fd1;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought162.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = ad2 > ad3;
    double ld1 = 418.60214300856416;
if(fo0 != null){
      ab4 = fo0.m2();
}
    fb0 = ad3 < ad4;
    double ld2 = 12.66091281883131;
    fb1 = ab1 && ab2;
    ad4 *= -1;
    Output.points[4][0] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld2, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (ab4) {
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
        Output.points[4][1] -= ld1;
        boolean lb4 = false;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    double ld0 = 495.5328318038102;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought299.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2();
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          ao1.m1(fb0, fb1, fb0, fb1);
}
        boolean lb2 = true;
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, ad1, ad2);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought99.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    double ld2 = 625.8761099726787;
    fb0 = fb1 && lb1;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
    Thought lo3 = Thought197.getInstance();
    fb1 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
    ad1 = ad2 - ad3;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld2);
}
    ad1 *= -1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    fb0 = ld2 < ad1;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      fd1 = ao3.m3();
}
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    if (ab4) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        Output.points[4][2] += fd0;
        fd1 = fd0 - fd1;
        ab3 = !ab4;
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab4 = fb0 || fb1;
    lb0 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ab2 = ad1 < ad2;
    Thought lo1 = Thought269.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
    boolean lb2 = false;
    ab2 = ab3 && ab4;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
    ab1 = fd1 < ad1;
    Output.points[4][3] -= ad2;
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 865.0954753270781;
    boolean lb1 = true;
    fd0 *= -1;
    boolean lb2 = true;
    lb2 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb1, lb2, fb0, fb1);
}
    lb1 = !lb2;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought139.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
        fd1 *= -1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    double ld0 = 940.05355337899;
    fb0 = ld0 > fd0;
    fb1 = fd1 > ld0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
              fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
    Thought lo1 = Thought361.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought387.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    double ld3 = 203.9453015123019;
    double ld4 = 757.1548178447918;
    boolean lb5 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
